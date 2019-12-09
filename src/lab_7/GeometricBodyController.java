package lab_7;

public class GeometricBodyController {
    public GeometricBody getMaxVolume(GeometricBody[] g) {
        double max = g[0].getVolume();
        int index = 0;
        for(int i = 1; i < g.length; i++) {
            if(g[i].getVolume() > max) {
                max = g[i].getVolume();
                index = i;
            }
        }
        return g[index];
    }

    public GeometricBody getMaxSurface(GeometricBody[] g) {
        double max = g[0].getSurface();
        int index = 0;
        for(int i = 0; i < g.length; i++) {
            if(g[i].getSurface() > max) {
                max = g[i].getSurface();
                index = i;
            }
        }
        return g[index];
    }
}
