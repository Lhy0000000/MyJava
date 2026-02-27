public class assignment01 {
    static void main() {
        //대입연산자
        int x = 5;
        System.out.println("x: "+x ); //정수형 변수 x에 숫자 5 대입/할당(assign)
//x=3;//덮어쓰기
        x+=3;//x= x+3;//산술을 우선 계산 이후 대입, 누적할당
        System.out.println("x: "+x );

        x*=4;
        System.out.println("x: "+x );

        x%=5;
        System.out.println("x: "+x );

        x-=1;
        System.out.println("x: "+x );

        x+=5;
        System.out.println("x: "+x );
    }

}
