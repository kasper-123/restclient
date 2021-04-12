package be.vdab.restclient.restclients;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DefaultReqResClientTest {
    private final  DefaultReqResClient client;

    DefaultReqResClientTest(DefaultReqResClient client) {
        this.client = client;
    }
    @Test
    void findBestaandeUser() {
        System.out.println("TEST " + client.findById(1));
        assertThat(client.findById(1).get().getData().getId()).isOne();}

    @Test
    void findOnbestaandeUser() {
    //    System.out.println(client.findById(-9).get().getData().getFirstName());
        assertThat(client.findById(-9)).isEmpty();}

    @Test
    void findAll(){
        System.out.println(client);

    }
}
