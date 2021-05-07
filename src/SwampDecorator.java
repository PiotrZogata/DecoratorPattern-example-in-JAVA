public class SwampDecorator extends TerrainDecorator{


    public SwampDecorator(Terrain terrain) {
        super(terrain);
    }

    @Override
    public int fuelCosts() {
        return terrain.fuelCosts() + 30;
    }


}
