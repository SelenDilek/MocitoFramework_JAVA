package MockConcept;

import java.util.List;

//Mockito is framework, unit testing,sample mock object of real server. (not need to db,server,connection ..)
//call mock object and use it your test.
// we will use with when and thenReturn()..
//Junit for testing
public class InjectMockConcept
{











    class Employee{

      List<String> empName;

        public List<String> getEmpName() {
            return empName;
        }

        public void setEmpName(List<String> empName) {
            this.empName = empName;
        }
    }

}
