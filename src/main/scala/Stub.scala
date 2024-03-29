package org.tomato

import com.jme3.app.SimpleApplication
import com.jme3.material.Material
import com.jme3.math.Vector3f
import com.jme3.scene.Geometry
import com.jme3.scene.shape.Box
import com.jme3.math.ColorRGBA

object Game extends SimpleApplication with App {
  this.start()

  def simpleInitApp {
    val b = new Box(Vector3f.ZERO, 1, 1, 1);
    val geom = new Geometry("Box", b);
    val mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
    mat.setColor("Color", ColorRGBA.Blue);
    geom.setMaterial(mat);
    rootNode.attachChild(geom);
  }
}
