package ch01_variable_operator;

public class Add {
    static void main() {
        //목표: 3 더하기 5은 8 입니다 출력하기   
        //변수 정의(선언)
    int x ;//정수형 데이터를 위하여 x를 준비하세요
    int y ;
    int result ;
    
    //변수에 값을 할당(대입) 정의 후 할당
    x=3;//대입, 할당, 쓰기
    y=5;
    result=x+y;// + 기호는 덧셈 쓰기 3회 읽기 2회
        System.out.println("x="+x);//+는 문자열 결합
        System.out.println("y="+y);
        System.out.println("result="+result);

        System.out.println(x+" 더하기 "+y+"는 "+result+"입니다");
        
        x=4; //이전 값을 덮어씀. overwrite
        y=8;
        result=x*y; // 4 곱하기 8은 32입니다
        System.out.println(x+" 곱하기 "+y+"은 "+result+"입니다");
    }
}
