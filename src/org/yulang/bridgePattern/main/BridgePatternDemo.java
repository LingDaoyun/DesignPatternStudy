package org.yulang.bridgePattern.main;

import org.yulang.bridgePattern.absractPkg.Shape;
import org.yulang.bridgePattern.impl.Circle;
import org.yulang.bridgePattern.impl.GreenCircle;
import org.yulang.bridgePattern.impl.RedCircle;
/**
 *  
 * @author lsihao
 */
public class BridgePatternDemo {
	public static void main(String[] args) {
		Shape redCircle = new Circle(4, 5, 2, new RedCircle());
		Shape greenCircle = new Circle(4,5,1,new GreenCircle());
		redCircle.draw();
		greenCircle.draw();
	}
}
