public class RoadDecorator extends TerrainDecorator{

    public RoadDecorator(Terrain terrain) {
        super(terrain);
    }

    @Override
    public int fuelCosts() {
        return terrain.fuelCosts() - 7;
    }
}
