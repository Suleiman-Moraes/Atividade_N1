package br.com.senaigo.exercicio02;

import java.awt.Color;
import java.io.File;

import org.joda.time.LocalTime;

import ij.IJ;
import ij.ImagePlus;
import ij.process.ImageProcessor;

public class Exercicio02 {

	public static void main(String[] args) {
		ImagePlus imp = IJ.openImage(new File("src\\main\\resources\\br\\com\\senaigo\\imagens\\medianeira.png").getAbsolutePath());
		ImageProcessor ip = imp.getProcessor();
		ip.setColor(Color.YELLOW);
		ip.setLineWidth(4);
		ip.drawRect(10, 10, imp.getWidth() - 20, imp.getHeight() - 20);
		imp.show();
		
		
	}
	
	public static LocalTime getHorario() {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime.toString());
		return currentTime;
	}

}
