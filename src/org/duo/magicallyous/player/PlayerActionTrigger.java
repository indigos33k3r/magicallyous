/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.duo.magicallyous.player;

import com.jme3.input.KeyInput;
import com.jme3.input.controls.KeyTrigger;
import com.jme3.input.controls.Trigger;

/**
 *
 * @author duo
 */
public class PlayerActionTrigger {
    public final static Trigger TRIGGER_MOVEFOWARD_KEY_UP = new KeyTrigger(KeyInput.KEY_UP);
    public final static Trigger TRIGGER_MOVEFOWARD_KEY_I = new KeyTrigger(KeyInput.KEY_I);
    public final static Trigger TRIGGER_MOVEBACKWARD_KEY_DOWN = new KeyTrigger(KeyInput.KEY_DOWN);
    public final static Trigger TRIGGER_STOP_KEY_SPACE = new KeyTrigger(KeyInput.KEY_SPACE);
    public final static Trigger TRIGGER_TURNRIGHT_KEY_RIGHT = new KeyTrigger(KeyInput.KEY_RIGHT);
    public final static Trigger TRIGGER_TURNLEFT_KEY_LEFT = new KeyTrigger(KeyInput.KEY_LEFT);
    public final static Trigger TRIGGER_TOGGLEWALKSTATE_KEY_R = new KeyTrigger(KeyInput.KEY_R);
    public final static Trigger TRIGGER_USESWORD_KEY_U = new KeyTrigger(KeyInput.KEY_U);
    public final static Trigger TRIGGER_INCREASEHEALTH_KEY_ADD = new KeyTrigger(KeyInput.KEY_ADD);
    public final static Trigger TRIGGER_DECREASEHEALTH_KEY_MINUS = new KeyTrigger(KeyInput.KEY_MINUS);
}