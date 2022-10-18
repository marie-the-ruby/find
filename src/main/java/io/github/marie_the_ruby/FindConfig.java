package io.github.marie_the_ruby;

import eu.midnightdust.lib.config.MidnightConfig;

public class FindConfig extends MidnightConfig {
	@Entry public static double scale = 1;
	@Entry public static Boolean anchor = true;
	@Entry public static int posX = 0;
	@Entry public static int posY = 0;
	@Entry(width = 7, min = 7, isColor = true) public static String nameColor = "#ffffff";

}
