package me.whiteship.inflearnthejavatest.study;

import me.whiteship.inflearnthejavatest.domain.Study;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledIf;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@ExtendWith(MockitoExtension.class)
public class StudyTest {

    @Test
    @DisplayName("스터디 만들기") // 테스트 메서드 이름 만들기 - 인텔리제이설정으로 테스트코드 실행을 intelliJ IDEA로 설정해야 함.
    @Tag("fast")
    @EnabledIf("javaVersionMatchesJava21")
    void create_new_study() {
//        Study study = new Study();
//        assertNotNull(study);
        System.out.println("create");
    }

    boolean javaVersionMatchesJava21() {
        return System.getProperty("java.version").startsWith("21.");
    }

    @Test
    @Tag("slow")
    void create_new_study_again() {
        System.out.println("create1");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Before each");
    }

    @AfterEach
    void afterEach() {
        System.out.println("After each");
    }

}
