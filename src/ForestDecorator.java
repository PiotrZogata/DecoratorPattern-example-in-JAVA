public class ForestDecorator extends TerrainDecorator{


    public ForestDecorator(Terrain terrain) {
        super(terrain);
    }

    @Override
    public int fuelCosts() {
        return terrain.fuelCosts() + 5;
    }

}
