# scala-json-serialize

Scala + json4s를 이용한 Json <-> Object 사용 예제
 

## Version

- JDK : Java SE 1.7.0.45
- SBT : 0.13.5
- Scala : 2.11.1
- json4s : 0.5.0


## 구성 방법

- 프로젝트 디렉토리를 생성 (C:\Project\scala-json\serialize)
- build.sbt와 project/plugins.bat 를 생성
- sbt 실행
    C:\Project\scala-json\serialize>sbt
    $> update
    $> eclipse
- 이클립스에서 import
- Json2Obj.scala 파일 생성


## 결과

    JObject(List((id,JInt(123)), (nick,JString(test)), (item,JArray(List(JInt(4), JInt(5), JInt(6))))))
    (ID=123,Nick=test,Item=List(4, 5, 6))
    Account(123,test,List(4, 5, 6))
    JString(Account(123,test,List(4, 5, 6)))
    "Account(123,test,List(4, 5, 6))"

