package com.collection;


 enum Direction 
{
    // enum fields
    EAST(0), WEST(180), NORTH(90), SOUTH(270);
 
    // constructor
    private Direction(final int angle) {
        this.angle = angle;
    }
 
    // internal state
    private int angle;
 
    public int getAngle() {
        return angle;
    }
}

public class TestEnum {
	
	public static void main(String[] args) {
		Direction north = Direction.NORTH;
		
		System.out.println(north.name());

	}

}
