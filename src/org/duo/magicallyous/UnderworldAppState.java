/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.duo.magicallyous;

import com.jme3.app.Application;
import com.jme3.app.SimpleApplication;
import com.jme3.app.state.AbstractAppState;
import com.jme3.app.state.AppStateManager;
import com.jme3.bullet.BulletAppState;
import com.jme3.bullet.control.RigidBodyControl;
import com.jme3.scene.Node;
import com.jme3.scene.Spatial;
import org.duo.magicallyous.player.PlayerAppState;

/**
 *
 * @author duo
 */
public class UnderworldAppState extends AbstractAppState {
    private SimpleApplication app;
    private Node underWorld;
    private Node boat;

    public Spatial getBoat() {
        return boat;
    }

    @Override
    public void initialize(AppStateManager stateManager, Application app) {
        super.initialize(stateManager, app);
        this.app = (SimpleApplication) app;
        // multiplayer, so, it should not pause on lost focus
        this.app.setPauseOnLostFocus(false);
        // use physics
        BulletAppState bulletAppState = new BulletAppState();
        stateManager.attach(bulletAppState);
        this.app.getRootNode().attachChild(app.getAssetManager().loadModel("Scenes/Underworld.j3o"));
        for(Spatial spatial : this.app.getRootNode().getChildren()) {
            System.out.println("Root children: " + spatial.getName());
        }
        // disable flycam
        this.app.getFlyByCamera().setEnabled(false);
        underWorld = (Node) this.app.getRootNode().getChild("New Scene");
        for(Spatial spatial : underWorld.descendantMatches(Node.class)) {
            System.out.println("New Scene descendant: "  + spatial.getName());
            if(spatial.getName().equals("Models/boat.j3o")) {
                boat = (Node) spatial;
            }
        }
        if(boat != null) {
            RigidBodyControl rigidBodyControl = new RigidBodyControl(0.0f);
            boat.addControl(rigidBodyControl);
            bulletAppState.getPhysicsSpace().add(boat);
        }
        // PlayerAppState to initialize player
        stateManager.attach(new PlayerAppState());
    }

    @Override
    public void update(float tpf) {
        super.update(tpf);
    }
    
    @Override
    public void cleanup() {
        super.cleanup();
        //TODO: clean up what you initialized in the initialize method,
        //e.g. remove all spatials from rootNode
        //this is called on the OpenGL thread after the AppState has been detached
    }

}