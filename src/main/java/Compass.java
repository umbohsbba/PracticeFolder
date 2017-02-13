
public class Compass {

	public static void main(String[] args) {
		String[] direction = null;
		String fromX = direction[0];
		String fromY = direction[1];
		String toX = direction[2];
		String toY = direction[3];
		
		boolean unchangedEastWest = asInt(fromX) == asInt(toX);
		boolean movingEast = asInt(fromX) < asInt(toX);
		boolean movingWest = !(movingEast || unchangedEastWest);
		
		String eastWestComponent; 
		
		if (unchangedEastWest) {
			eastWestComponent = " ";
			}
		else if(movingEast) {
			eastWestComponent = "E";
			}
		else if (movingWest) {
			eastWestComponent = "W";
		}
		}
		
		
		
	
		
	}

	private static Object asInt(String toX) {
		// TODO Auto-generated method stub
		return null;
	}

}
	