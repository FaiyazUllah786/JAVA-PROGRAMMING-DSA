package String;

public class ShortestPath {
    public static float shortestPath(String path) {
        int x = 0;
        int y = 0;// intially origin is at(0,0)
        for (int i = 0; i < path.length(); i++) {
            switch (path.charAt(i)) {
                case 'N':
                    x++;
                    break;
                case 'S':
                    x--;
                    break;
                case 'E':
                    y++;
                    break;
                case 'W':
                    y--;
                    break;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float) Math.sqrt(x2 + y2);
    }

    public static void main(String[] args) {

        String path = "WNEENESENNN";
        System.out.println(shortestPath(path));
    }
}
