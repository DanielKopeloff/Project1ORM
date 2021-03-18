package Tables;

import Annotations.Entity;
import Annotations.FieldName;
import Annotations.IgnoreORM;
import Annotations.PrimaryKey;

@Entity
public class Car {

    @PrimaryKey
    private int id = 25;

    @FieldName
    private String name ="Daniel";

    @FieldName
    private String year = "1997";

    @IgnoreORM
    private String type ="Honda";

//    @Entity
//    public class Wheels{
//        @PrimaryKey
//        private int Wheelsid = 35;
//        @FieldName
//        private String weekend ="AfterHours";
//
//
//        public class Rims{
//            @PrimaryKey
//            private String yearid = "5";
//
//            @FieldName
//            private String keepAway ="Gotemm";
//
//        }


    //}

}
