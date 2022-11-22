public class FrogJump {

    public int solution(int x, int y,int d){
        int distance = y-x;
        int jump = (int)Math.ceil(distance/(double)d);
        return jump;
    }

    public static void main(String[] args){
        System.out.println(new FrogJump().solution(10,80, 30 ));
    }


}
