## MultiCampus_Java_BackEnd
#### 2023. 08. 11
##### Throw Exception 
* 예외 처리를 하위에서 상위로 던질 수 있었음
* 기능을 담당하는 클래스에서 예외처리 구문 작성이 완료되었다면 main에도 예외처리가 있어야 했음
* 에러 발생 시 메세지는 e.getMessage() 메서드로 불러올 수 있ㅇ므

##### Throw Exception Exception Class
```
package org.galapagos.mcmorning.exception;

public class UseridCountOverException extends Exception{

    public UseridCountOverException() {
        super("🙏ID Check Count Over🙏");
    }

}
```
##### Throw Exception Service Class
```
public String inputUserid() throws UseridCountOverException {
        String userid = "";

        for(int i = 0; i < 3; i++) {
            userid = Input.read("Userid : ");
            Member m = dao.findByUserid(userid);

            if (m != null) {
                System.out.println(userid + " is Duplicated!");
            } else {
                return userid;
            }
        }
        throw new UseridCountOverException();
    }
```
##### Throw Exception Test Class
```
public void singUP(){
        // Member 정보 입력
        // id 중복 체크

        try {
            Member member = inputMember();
        }
        catch (UseridCountOverException e) {
            System.out.println(e.getMessage());
        }
    }
```
