```
Object I/O by serialization / deserialization
: writeObject / readObject.
public class SomeClass0 """implements Serializable""" // ObjectInputStream / output 에서 지원되는 것 (import 필요)

outputStream.writeObject(oneRecord);
readOne = (Species)inputStream.readObject(); // 주의: Narrow Type casting 필요
// *** Array(배열) 입력할 경우 형변환도 (Species[])로 해줘야 함

EmployeeMain.java 복습해보기
(Employee에 implements Serializable 붙여서 File I/O 하는 것)


배열에는 .length(변수임)


```
