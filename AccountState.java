public interface AccountState
{
    public withdraw(Double withdrawAmount, Account account);
    public deposit(Double depositAmount, Account account);

    public activate(AccountState accountState);
    public suspend(AccountState accountState);
    public closed(AccountState accountState);
}