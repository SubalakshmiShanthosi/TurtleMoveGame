
package turtlemove;

public enum Direction {

    N(0,1,"N") {
        @Override
        public Direction left() {
            return W;
        }

        @Override
        public Direction right() {
            return E;
        }
    },

    S(0,-1,"S") {
        @Override
        public Direction right() {
            return W;
        }

        @Override
        public Direction left() {
            return E;
        }
    },

    E(1,0,"E") {
        @Override
        public Direction right() {
            return S;
        }

        @Override
        public Direction left() {
            return N;
        }
    },

    W(-1,0,"W") {
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
    private String text;
    public Integer getStepXCoordinate() {
        return StepXCoordinate;
    }

    public Integer getStepYCoordinate() {
        return StepYCoordinate;
    }

    Direction(Integer stepSizeOnXAxis, Integer stepSizeOnYAxis,String text) {
        this.StepXCoordinate = stepSizeOnXAxis;
        this.StepYCoordinate = stepSizeOnYAxis;
        this.text=text;
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
        return text;
    }
}