import java.lang.reflect.Method;

public class FoundTheLoopHelloWorld100 extends ClassLoader
	{
	    public static Class look;
	    private static final byte[] bytes =
	        {
	          -54, -2, -70, -66, 0, 0, 0, 48, 0, 29, 10, 0, 5, 0, 15, 9, 0, 16, 0,
	          17, 10, 0, 18, 0, 19, 7, 0, 20, 7, 0, 21, 1, 0, 6, 60, 105, 110, 105,
	          116, 62, 1, 0, 3, 40, 41, 86, 1, 0, 4, 67, 111, 100, 101, 1, 0, 15,
	          76, 105, 110, 101, 78, 117, 109, 98, 101, 114, 84, 97, 98, 108, 101,
	          1, 0, 4, 115, 104, 111, 119, 1, 0, 10, 69, 120, 99, 101, 112, 116,
	          105, 111, 110, 115, 7, 0, 22, 1, 0, 10, 83, 111, 117, 114, 99, 101,
	          70, 105, 108, 101, 1, 0, 18, 72, 101, 114, 101, 115, 89, 111, 117,
	          114, 76, 111, 111, 112, 46, 106, 97, 118, 97, 12, 0, 6, 0, 7, 7, 0,
	          23, 12, 0, 24, 0, 25, 7, 0, 26, 12, 0, 27, 0, 28, 1, 0, 13, 72, 101,
	          114, 101, 115, 89, 111, 117, 114, 76, 111, 111, 112, 1, 0, 16, 106,
	          97, 118, 97, 47, 108, 97, 110, 103, 47, 79, 98, 106, 101, 99, 116, 1,
	          0, 19, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 69, 120, 99, 101,
	          112, 116, 105, 111, 110, 1, 0, 16, 106, 97, 118, 97, 47, 108, 97, 110,
	          103, 47, 83, 121, 115, 116, 101, 109, 1, 0, 3, 111, 117, 116, 1, 0, 21,
	          76, 106, 97, 118, 97, 47, 105, 111, 47, 80, 114, 105, 110, 116, 83,
	          116, 114, 101, 97, 109, 59, 1, 0, 19, 106, 97, 118, 97, 47, 105, 111,
	          47, 80, 114, 105, 110, 116, 83, 116, 114, 101, 97, 109, 1, 0, 5, 119,
	          114, 105, 116, 101, 1, 0, 5, 40, 91, 66, 41, 86, 0, 33, 0, 4, 0, 5, 0,
	          0, 0, 0, 0, 2, 0, 1, 0, 6, 0, 7, 0, 1, 0, 8, 0, 0, 0, 29, 0, 1, 0, 1,
	          0, 0, 0, 5, 42, -73, 0, 1, -79, 0, 0, 0, 1, 0, 9, 0, 0, 0, 6, 0, 1, 0,
	          0, 0, 1, 0, 9, 0, 10, 0, 7, 0, 2, 0, 8, 0, 0, 5, 4, 0, 4, 0, 1, 0, 0,
	          4, -28, 17, 0, -60, -68, 8, 89, 3, 16, 105, 84, 89, 4, 16, 109, 84, 89,
	          5, 16, 112, 84, 89, 6, 16, 111, 84, 89, 7, 16, 114, 84, 89, 8, 16, 116,
	          84, 89, 16, 6, 16, 32, 84, 89, 16, 7, 16, 106, 84, 89, 16, 8, 16, 97,
	          84, 89, 16, 9, 16, 118, 84, 89, 16, 10, 16, 97, 84, 89, 16, 11, 16, 46,
	          84, 89, 16, 12, 16, 105, 84, 89, 16, 13, 16, 111, 84, 89, 16, 14, 16,
	          46, 84, 89, 16, 15, 16, 80, 84, 89, 16, 16, 16, 114, 84, 89, 16, 17,
	          16, 105, 84, 89, 16, 18, 16, 110, 84, 89, 16, 19, 16, 116, 84, 89, 16,
	          20, 16, 83, 84, 89, 16, 21, 16, 116, 84, 89, 16, 22, 16, 114, 84, 89,
	          16, 23, 16, 101, 84, 89, 16, 24, 16, 97, 84, 89, 16, 25, 16, 109, 84,
	          89, 16, 26, 16, 59, 84, 89, 16, 27, 16, 13, 84, 89, 16, 28, 16, 10, 84,
	          89, 16, 29, 16, 13, 84, 89, 16, 30, 16, 10, 84, 89, 16, 31, 16, 112, 84,
	          89, 16, 32, 16, 117, 84, 89, 16, 33, 16, 98, 84, 89, 16, 34, 16, 108,
	          84, 89, 16, 35, 16, 105, 84, 89, 16, 36, 16, 99, 84, 89, 16, 37, 16,
	          32, 84, 89, 16, 38, 16, 99, 84, 89, 16, 39, 16, 108, 84, 89, 16, 40,
	          16, 97, 84, 89, 16, 41, 16, 115, 84, 89, 16, 42, 16, 115, 84, 89, 16,
	          43, 16, 32, 84, 89, 16, 44, 16, 72, 84, 89, 16, 45, 16, 101, 84, 89,
	          16, 46, 16, 108, 84, 89, 16, 47, 16, 108, 84, 89, 16, 48, 16, 111, 84,
	          89, 16, 49, 16, 87, 84, 89, 16, 50, 16, 111, 84, 89, 16, 51, 16, 114,
	          84, 89, 16, 52, 16, 108, 84, 89, 16, 53, 16, 100, 84, 89, 16, 54, 16,
	          49, 84, 89, 16, 55, 16, 48, 84, 89, 16, 56, 16, 48, 84, 89, 16, 57, 16,
	          13, 84, 89, 16, 58, 16, 10, 84, 89, 16, 59, 16, 123, 84, 89, 16, 60, 16,
	          13, 84, 89, 16, 61, 16, 10, 84, 89, 16, 62, 16, 32, 84, 89, 16, 63, 16,
	          32, 84, 89, 16, 64, 16, 32, 84, 89, 16, 65, 16, 32, 84, 89, 16, 66, 16,
	          112, 84, 89, 16, 67, 16, 117, 84, 89, 16, 68, 16, 98, 84, 89, 16, 69,
	          16, 108, 84, 89, 16, 70, 16, 105, 84, 89, 16, 71, 16, 99, 84, 89, 16,
	          72, 16, 32, 84, 89, 16, 73, 16, 115, 84, 89, 16, 74, 16, 116, 84, 89,
	          16, 75, 16, 97, 84, 89, 16, 76, 16, 116, 84, 89, 16, 77, 16, 105, 84,
	          89, 16, 78, 16, 99, 84, 89, 16, 79, 16, 32, 84, 89, 16, 80, 16, 118,
	          84, 89, 16, 81, 16, 111, 84, 89, 16, 82, 16, 105, 84, 89, 16, 83, 16,
	          100, 84, 89, 16, 84, 16, 32, 84, 89, 16, 85, 16, 100, 84, 89, 16, 86,
	          16, 111, 84, 89, 16, 87, 16, 73, 84, 89, 16, 88, 16, 116, 84, 89, 16,
	          89, 16, 40, 84, 89, 16, 90, 16, 41, 84, 89, 16, 91, 16, 13, 84, 89,
	          16, 92, 16, 10, 84, 89, 16, 93, 16, 32, 84, 89, 16, 94, 16, 32, 84,
	          89, 16, 95, 16, 32, 84, 89, 16, 96, 16, 32, 84, 89, 16, 97, 16, 123,
	          84, 89, 16, 98, 16, 13, 84, 89, 16, 99, 16, 10, 84, 89, 16, 100, 16,
	          32, 84, 89, 16, 101, 16, 32, 84, 89, 16, 102, 16, 32, 84, 89, 16, 103,
	          16, 32, 84, 89, 16, 104, 16, 32, 84, 89, 16, 105, 16, 32, 84, 89, 16,
	          106, 16, 32, 84, 89, 16, 107, 16, 32, 84, 89, 16, 108, 16, 102, 84, 89,
	          16, 109, 16, 111, 84, 89, 16, 110, 16, 114, 84, 89, 16, 111, 16, 40,
	          84, 89, 16, 112, 16, 105, 84, 89, 16, 113, 16, 110, 84, 89, 16, 114,
	          16, 116, 84, 89, 16, 115, 16, 32, 84, 89, 16, 116, 16, 105, 84, 89,
	          16, 117, 16, 32, 84, 89, 16, 118, 16, 61, 84, 89, 16, 119, 16, 32, 84,
	          89, 16, 120, 16, 48, 84, 89, 16, 121, 16, 59, 84, 89, 16, 122, 16, 32,
	          84, 89, 16, 123, 16, 105, 84, 89, 16, 124, 16, 32, 84, 89, 16, 125, 16,
	          60, 84, 89, 16, 126, 16, 32, 84, 89, 16, 127, 16, 49, 84, 89, 17, 0,
	          -128, 16, 48, 84, 89, 17, 0, -127, 16, 48, 84, 89, 17, 0, -126, 16, 59,
	          84, 89, 17, 0, -125, 16, 32, 84, 89, 17, 0, -124, 16, 105, 84, 89, 17,
	          0, -123, 16, 43, 84, 89, 17, 0, -122, 16, 43, 84, 89, 17, 0, -121, 16,
	          41, 84, 89, 17, 0, -120, 16, 13, 84, 89, 17, 0, -119, 16, 10, 84, 89,
	          17, 0, -118, 16, 32, 84, 89, 17, 0, -117, 16, 32, 84, 89, 17, 0, -116,
	          16, 32, 84, 89, 17, 0, -115, 16, 32, 84, 89, 17, 0, -114, 16, 32, 84,
	          89, 17, 0, -113, 16, 32, 84, 89, 17, 0, -112, 16, 32, 84, 89, 17, 0,
	          -111, 16, 32, 84, 89, 17, 0, -110, 16, 32, 84, 89, 17, 0, -109, 16, 32,
	          84, 89, 17, 0, -108, 16, 32, 84, 89, 17, 0, -107, 16, 32, 84, 89, 17,
	          0, -106, 16, 83, 84, 89, 17, 0, -105, 16, 121, 84, 89, 17, 0, -104, 16,
	          115, 84, 89, 17, 0, -103, 16, 116, 84, 89, 17, 0, -102, 16, 101, 84,
	          89, 17, 0, -101, 16, 109, 84, 89, 17, 0, -100, 16, 46, 84, 89, 17, 0,
	          -99, 16, 111, 84, 89, 17, 0, -98, 16, 117, 84, 89, 17, 0, -97, 16, 116,
	          84, 89, 17, 0, -96, 16, 46, 84, 89, 17, 0, -95, 16, 112, 84, 89, 17, 0,
	          -94, 16, 114, 84, 89, 17, 0, -93, 16, 105, 84, 89, 17, 0, -92, 16, 110,
	          84, 89, 17, 0, -91, 16, 116, 84, 89, 17, 0, -90, 16, 108, 84, 89, 17,
	          0, -89, 16, 110, 84, 89, 17, 0, -88, 16, 40, 84, 89, 17, 0, -87, 16,
	          34, 84, 89, 17, 0, -86, 16, 72, 84, 89, 17, 0, -85, 16, 101, 84, 89,
	          17, 0, -84, 16, 108, 84, 89, 17, 0, -83, 16, 108, 84, 89, 17, 0, -82,
	          16, 111, 84, 89, 17, 0, -81, 16, 32, 84, 89, 17, 0, -80, 16, 87, 84,
	          89, 17, 0, -79, 16, 111, 84, 89, 17, 0, -78, 16, 114, 84, 89, 17, 0,
	          -77, 16, 108, 84, 89, 17, 0, -76, 16, 100, 84, 89, 17, 0, -75, 16, 34,
	          84, 89, 17, 0, -74, 16, 41, 84, 89, 17, 0, -73, 16, 59, 84, 89, 17, 0,
	          -72, 16, 13, 84, 89, 17, 0, -71, 16, 10, 84, 89, 17, 0, -70, 16, 32,
	          84, 89, 17, 0, -69, 16, 32, 84, 89, 17, 0, -68, 16, 32, 84, 89, 17, 0,
	          -67, 16, 32, 84, 89, 17, 0, -66, 16, 125, 84, 89, 17, 0, -65, 16, 13,
	          84, 89, 17, 0, -64, 16, 10, 84, 89, 17, 0, -63, 16, 125, 84, 89, 17, 0,
	          -62, 16, 13, 84, 89, 17, 0, -61, 16, 10, 84, 75, -78, 0, 2, 42, -74, 0,
	          3, -79, 0, 0, 0, 1, 0, 9, 0, 0, 0, 14, 0, 3, 0, 0, 0, 5, 4, -36, 0, 18,
	          4, -29, 0, 19, 0, 11, 0, 0, 0, 4, 0, 1, 0, 12, 0, 1, 0, 13, 0, 0, 0, 2,
	          0, 14
	        };
	    public FoundTheLoopHelloWorld100()
	    {
	        look = defineClass("HeresYourLoop", bytes, 0, bytes.length);
	    }
	    public static void main(String[] args) throws Exception
	    {
	        new FoundTheLoopHelloWorld100();
	        Method doIt = look.getDeclaredMethod("show", null);
	        doIt.invoke(null, null);
	    }
}