package frc.controllers.basecontrollers;

import static frc.robot.Robot.robotSettings;

public class DefaultControllerEnums {

    /**
     * @see WiiController
     */
    public enum WiiAxis implements ControllerInterfaces.IContinuousInput {
        LEFT_RIGHT_NUMBERPAD(0), UP_DOWN_NUMBERPAD(1), ROTATIONAL_TILT(3), FORWARD_TILT(4);

        public final int AXIS_VALUE;

        WiiAxis(int val) {
            AXIS_VALUE = val;
        }

        @Override
        public int getChannel() {
            return AXIS_VALUE;
        }
    }

    /**
     * @see WiiController
     */
    public enum WiiButton implements ControllerInterfaces.IDiscreteInput {
        ONE(1), TWO(2), A(3), B(4), PLUS(5), MINUS(6), HOME(7);

        public final int AXIS_VALUE;

        WiiButton(int val) {
            AXIS_VALUE = val;
        }

        @Override
        public int getChannel() {
            return AXIS_VALUE;
        }
    }

    public enum ResolvedCompassInput {
        UP(315, 0, 45), DOWN(135, 180, 225), LEFT(270), RIGHT(90);

        public final int[] ACCEPTED_VALUES;

        ResolvedCompassInput(int... values) {
            this.ACCEPTED_VALUES = values;
        }

        public boolean containsAngle(int angleIn) {
            for (int angle : ACCEPTED_VALUES)
                if (angle == angleIn)
                    return true;
            return false;
        }
    }

    public enum RawCompassInput {
        UP(0), DOWN(180), LEFT(270), RIGHT(90), UP_LEFT(315), UP_RIGHT(45), DOWN_LEFT(225), DOWN_RIGHT(135);

        public final int POV_ANGLE;

        RawCompassInput(int position) {
            this.POV_ANGLE = position;
        }
    }

    /**
     * Contains the tidy enumarations for determining the status of a toggle on/off button
     */
    public enum ButtonStatus {
        /**
         * Button is not pressed
         */
        UP,
        /**
         * Button is pressed
         */
        DOWN;

        /**
         * Gets the enumeration matching the boolean
         *
         * @param pressed whether the button is pressed or not
         * @return the corresponding enumeration for the input passed in
         */
        public static ButtonStatus get(boolean pressed) {
            if (pressed) {
                return DOWN;
            }
            return UP;
        }

        /**
         * @return returns true is this is {@link #DOWN}, else false
         */
        public boolean isPressed() {
            return this == DOWN;
        }

        /**
         * @return returns true is this is {@link #UP}, else false
         */
        public boolean isUp() {
            return !isPressed();
        }
    }

    /**
     * @see XBoxController
     */
    public enum XboxAxes implements ControllerInterfaces.IContinuousInput {
        LEFT_JOY_X(0, robotSettings.XBOX_CONTROLLER_DEADZONE), LEFT_JOY_Y(1, robotSettings.XBOX_CONTROLLER_DEADZONE), LEFT_TRIGGER(2, 0), RIGHT_TRIGGER(3, 0), RIGHT_JOY_X(4, robotSettings.XBOX_CONTROLLER_DEADZONE), RIGHT_JOY_Y(5, robotSettings.XBOX_CONTROLLER_DEADZONE);

        public final int AXIS_VALUE;
        public final double DEADZONE;

        XboxAxes(int axis, double deadzone) {
            this.AXIS_VALUE = axis;
            this.DEADZONE = deadzone;
        }

        @Override
        public int getChannel() {
            return AXIS_VALUE;
        }
    }

    /**
     * @see XBoxController
     */
    public enum XBoxButtons implements ControllerInterfaces.IDiscreteInput {
        A_CROSS(1), B_CIRCLE(2), LEFT_JOYSTICK_BUTTON(9), RIGHT_JOYSTICK_BUTTON(10), Y_TRIANGLE(4), LEFT_BUMPER(5), RIGHT_BUMPER(6), GUIDE(7), MENU(8), X_SQUARE(3);

        public final int AXIS_VALUE;

        XBoxButtons(int axis) {
            this.AXIS_VALUE = axis;
        }

        @Override
        public int getChannel() {
            return AXIS_VALUE;
        }
    }

    public enum XBoxPOVButtons implements ControllerInterfaces.IDiscreteInput {
        UP(0), DOWN(180), LEFT(270), RIGHT(90), UP_LEFT(315), UP_RIGHT(45), DOWN_LEFT(225), DOWN_RIGHT(135);

        public final int POV_ANGLE;

        XBoxPOVButtons(int position) {
            this.POV_ANGLE = position;
        }

        @Override
        public int getChannel() {
            return POV_ANGLE;
        }
    }

    /**
     * @see JoystickController
     */
    public enum JoystickAxis implements ControllerInterfaces.IContinuousInput {
        X_AXIS(0), Y_AXIS(1), Z_ROTATE(2), SLIDER(3);

        public final int AXIS_VALUE;

        JoystickAxis(int value) {
            this.AXIS_VALUE = value;
        }

        @Override
        public int getChannel() {
            return AXIS_VALUE;
        }
    }

    /**
     * @see JoystickController
     */
    public enum JoystickHatDirection {
        UP(315, 0, 45), DOWN(135, 180, 225), LEFT(270), RIGHT(90);

        public final int[] ACCEPTED_VALUES;

        JoystickHatDirection(int... values) {
            this.ACCEPTED_VALUES = values;
        }
    }

    /**
     * @see JoystickController
     */
    public enum JoystickButtons implements ControllerInterfaces.IDiscreteInput {
        ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), ELEVEN(11), TWELVE(12);

        public final int AXIS_VALUE;

        JoystickButtons(int value) {
            this.AXIS_VALUE = value;
        }

        @Override
        public int getChannel() {
            return AXIS_VALUE;
        }
    }

    public enum SixKeyGuitarButtons implements ControllerInterfaces.IDiscreteInput {
        ONE(2), TWO(3), THREE(4), FOUR(1), FIVE(5), SIX(6), HERO_POWER(9), PAUSE(10), MENU(11), REFRESH(13);

        public final int AXIS_VALUE;

        SixKeyGuitarButtons(int value) {
            this.AXIS_VALUE = value;
        }

        @Override
        public int getChannel() {
            return AXIS_VALUE;
        }
    }

    public enum SixKeyGuitarAxis implements ControllerInterfaces.IContinuousInput {
        STRUM(1), PITCH(2), WHAMMY(3);

        public final int AXIS_VALUE;

        SixKeyGuitarAxis(int value) {
            this.AXIS_VALUE = value;
        }

        @Override
        public int getChannel() {
            return AXIS_VALUE;
        }
    }

    public enum Drums implements ControllerInterfaces.IDiscreteInput {
        RED(3),
        YELLOW(4),
        BLUE(1),
        GREEN(2);

        public final int AXIS_VALUE;

        Drums(int value) {
            this.AXIS_VALUE = value;
        }

        @Override
        public int getChannel() {
            return AXIS_VALUE;
        }
    }

    public enum DrumButton implements ControllerInterfaces.IDiscreteInput {
        ONE(1),
        TWO(4),
        A(2),
        B(3),
        PEDAL(5),
        SELECT(9),
        START(10),
        HOME(13);

        public final int AXIS_VALUE;

        DrumButton(int value) {
            this.AXIS_VALUE = value;
        }

        @Override
        public int getChannel() {
            return AXIS_VALUE;
        }
    }

    public enum BopItButtons implements ControllerInterfaces.IDiscreteInput {
        BOPIT(3),
        PULLIT(4),
        TWISTIT(1);

        public final int AXIS_VALUE;

        BopItButtons(int value) {
            AXIS_VALUE = value;
        }

        @Override
        public int getChannel() {
            return AXIS_VALUE;
        }
    }
}
