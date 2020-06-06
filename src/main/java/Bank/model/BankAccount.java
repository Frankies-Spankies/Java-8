package Bank.model;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiFunction;

public class BankAccount {
    String id;
    double balance;
    String accountName;
    final Lock lock = new ReentrantLock();

    BiFunction<Double, Double, Double> subtract = (acumulado, monto) -> acumulado - monto;
    BiFunction<Double, Double, Double> add = (acumulado, monto) -> acumulado + monto;


    public boolean pagar(double amount) throws InterruptedException {
        if (this.lock.tryLock()) {
            Thread.sleep(100);
            balance = subtract.apply(balance, amount);
            this.lock.unlock();
            return true;
        }
        return false;
    }

    public boolean cobrar(double amount) throws InterruptedException {
        if (this.lock.tryLock()) {
            Thread.sleep(100);
            balance = add.apply(balance, amount);
            this.lock.unlock();
            return true;
        }
        return false;
    }

    public boolean transfer(BankAccount account, double ammount) throws InterruptedException {
        if (this.pagar(ammount)) {
            System.out.println("Pagando a :" + account.accountName + " Cantidad: " + ammount);
            if (account.cobrar(ammount)) {
                System.out.println("Recibiendo de : " + this.accountName + " Cantidad");
                return true;
            } else {
                System.out.println("Ha ocurrido un error");
                while (!account.cobrar(ammount))
                    continue;
            }
        }
        return false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BankAccount that = (BankAccount) o;

        if (Double.compare(that.balance, balance) != 0) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return accountName != null ? accountName.equals(that.accountName) : that.accountName == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id != null ? id.hashCode() : 0;
        temp = Double.doubleToLongBits(balance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (accountName != null ? accountName.hashCode() : 0);
        return result;
    }
}
