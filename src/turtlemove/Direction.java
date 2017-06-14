/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turtlemove;

public enum Direction {

    N(0,1) {
        @Override
        public Direction left() {
            return W;
        }

        @Override
        public Direction right() {
            return E;
        }
    },

    S(0,-1) {
        @Override
        public Direction right() {
            return W;
        }

        @Override
        public Direction left() {
            return E;
        }
    },

    E(1,0) {
        @Override
        public Direction right() {
            return S;
        }

        @Override
        public Direction left() {
            return N;
        }
    },

    W(-1,0) {
        @Override
        public Direction right() {
            return N;
        }

        @Override
        public Direction left() {
            return S;
        }
    };

    private Integer StepXCoordinate;
    private Integer StepYCoordinate;

    public Integer getStepXCoordinate() {
        return StepXCoordinate;
    }

    public Integer getStepYCoordinate() {
        return StepYCoordinate;
    }

    Direction(Integer stepSizeOnXAxis, Integer stepSizeOnYAxis) {
        this.StepXCoordinate = stepSizeOnXAxis;
        this.StepYCoordinate = stepSizeOnYAxis;
    }

    public abstract Direction right();
    public abstract Direction left();

    public Integer stepSizeForXAxis() {
        return this.StepXCoordinate;
    }

    public Integer stepSizeForYAxis() {
        return this.StepYCoordinate;
    }

    @Override
    public String toString() {
        return "Direction{" + "stepSizeOnXAxis=" + StepXCoordinate + ", stepSizeOnYAxis=" + StepYCoordinate + '}';
    }

}