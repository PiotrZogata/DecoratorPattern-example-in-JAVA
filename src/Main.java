public class Main {
    public static void main(String[] args) {


     generateMap();
    }

    private static void generateMap(){
        Terrain terrain = new Plain();
        Terrain terrain1 = new Hill();
        Terrain terrain2 = new SwampDecorator(new Hill());

        Terrain terrain3 = new SwampDecorator(new Plain());

        Terrain terrain4 = new RoadDecorator(new SwampDecorator(new Plain()));



        System.out.println("Swamp Hill cost " + terrain2.fuelCosts() + " points of move.");

        System.out.println("Swamp Plain cost " + terrain3.fuelCosts() + " points of move.");

        System.out.println("Road Swamp Plain cost " + terrain4.fuelCosts() + " points of move.");

    }
}
