-- Validate fund transfer
SELECT * FROM transactions WHERE from_account = '123456' AND to_account = '654321' AND amount = '1000';

-- Validate account balance
SELECT balance FROM accounts WHERE account_number = '123456';
