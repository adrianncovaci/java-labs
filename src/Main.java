//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.List;
import javax.swing.*;
import java.awt.event.*;
import lab_7.*;

class Main {

    public Main() {
    }

    public static void main(String[] var0) {
        GeometricBody p1 = new Cuboid(2,3,4);
        GeometricBody s1 = new Sphere(5);
        GeometricBody c1 = new Cube(9);
        GeometricBody[] g1 = new GeometricBody[]{p1, s1, c1};
        GeometricBodyController ctrl = new GeometricBodyController();
        System.out.println(ctrl.getMaxSurface(g1));
        }
}
