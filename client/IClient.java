package client;


import org.jetbrains.annotations.NotNull;

public interface IClient {

    void transferFunds(double amount,@NotNull Client receiverClient);
    void checkFunds();
    
}
