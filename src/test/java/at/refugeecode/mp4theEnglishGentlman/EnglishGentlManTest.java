package at.refugeecode.mp4theEnglishGentlman;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
class EnglishGentlManTest{

    @Autowired
    private EnglishGentlMan englishGentlMan;

    @Test
    void areEnjoy() {

        englishGentlMan.read(new Newspaper());
        englishGentlMan.smoke(new Cigar());
        assertEquals(true,englishGentlMan.areEnjoy() );
    }
    @Test
    void areNotEnjoy(){

        assertEquals(false,englishGentlMan.areEnjoy() );
    }
}