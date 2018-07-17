package hello;

import java.util.Locale;
import java.util.Optional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.github.javafaker.Faker;

public class HelloTest {
    private Faker faker;

    @Before
    public void setUp() throws Exception {
        faker = new Faker();
    }

    @After
    public void tearDown() throws Exception {
        faker = null;
    }

    @Test
    public void shouldGenerateFakeDataTest() throws Exception {
        printFaker(faker);
    }

    @Test
    public void shouldGenerateFakeDataWithLocaleTest() throws Exception {
        faker = new Faker(new Locale(Locale.GERMANY.toString()));
        printFaker(faker);
    }

    @Test
    public void shouldGenerateRickAndMortyFakeDataTest() throws Exception {
        String character = faker.rickAndMorty().character();
        String quote = faker.rickAndMorty().quote();
        System.out.println(character + " is the rick and morty character");
        System.out.println(quote + " is the rick and morty quote");
    }

    private void printFaker(final Faker faker) {
        System.out.println(faker.name().fullName() + " is the name of the faker");
        System.out.println(faker.name().firstName() + " is the first name of the faker");
        System.out.println(faker.name().lastName() + " is the last name of the faker");
        System.out.println(faker.address().fullAddress() +" is the street address of the faker");
    }
}
