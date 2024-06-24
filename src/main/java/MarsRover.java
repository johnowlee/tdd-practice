public class MarsRover {

    private int xCoordinate;
    private int yCoordinate;
    private char[] moveCommandArray;
    private DIRECTION direction;
    
    enum DIRECTION {
        E, W, S, N
    }

    public MarsRover() {
        this.xCoordinate = 0;
        this.yCoordinate = 0;
        this.direction = DIRECTION.N;
    }

    public void execute(String m) {
        setMoveCommandArray(m);
        executeCommand();
    }

    private void executeCommand() {
        for (char c : moveCommandArray) {
            String command = String.valueOf(c);
            switch (command) {
                case "L", "R" -> switchDirection(command);
                case "M" -> move();
            }
        }
    }

    private void setMoveCommandArray(String m) {
        moveCommandArray = new char[m.length()];
        separateEachCommand(m);
    }

    private void separateEachCommand(String m) {
        for (int i = 0; i < m.length(); i++) {
            char c = m.charAt(i);
            moveCommandArray[i] = c;
        }
    }

    private void move() {
        switch (direction) {
            case E -> increaseXCoordinate();
            case N -> increaseYCoordinate();
            case W -> decreaseXCoordinate();
            case S -> decreaseYCoordinate();
        }
    }

    private void decreaseYCoordinate() {
        switch (yCoordinate) {
            case 0 ->  yCoordinate = 9;
            default -> yCoordinate --;
        }
    }

    private void decreaseXCoordinate() {
        switch (xCoordinate) {
            case 0 ->  xCoordinate = 9;
            default -> xCoordinate --;
        }
    }

    private void increaseYCoordinate() {
        switch (yCoordinate) {
            case 9 ->  yCoordinate = 0;
            default -> yCoordinate ++;
        }
    }

    private void increaseXCoordinate() {
        switch (xCoordinate) {
            case 9 ->  xCoordinate = 0;
            default -> xCoordinate ++;
        }
    }

    private void switchDirection(String command) {
        switch (command) {
            case "L" -> turnLeft();
            case "R" -> turnRight();
        }
    }

    private void turnRight() {
        switch (direction) {
            case E -> direction = DIRECTION.S;
            case S -> direction = DIRECTION.W;
            case W -> direction = DIRECTION.N;
            case N -> direction = DIRECTION.E;
        }
    }

    private void turnLeft() {
        switch (direction) {
            case E -> direction = DIRECTION.N;
            case N -> direction = DIRECTION.W;
            case W -> direction = DIRECTION.S;
            case S -> direction = DIRECTION.E;
        }
    }

    public String location() {
        return xCoordinate + ":" + yCoordinate + ":" + direction;
    }

    public int xCoordinate() {
        return xCoordinate;
    }

    public int yCoordinate() {
        return yCoordinate;
    }

    public DIRECTION direction() {
        return direction;
    }
}
