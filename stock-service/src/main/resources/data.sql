insert into DraftLog (date, reason, userId) values ("2019-01-01 09:00:00", "2019 jan openstock", 1)

insert into DraftDetails ( OSid, itemCode, batchId, quantity) values ( 1, 1, "A001", 24)
insert into DraftDetails ( OSid, itemCode, batchId, quantity) values ( 1, 2, "A002", 24)
insert into DraftDetails ( OSid, itemCode, batchId, quantity) values ( 1, 3, "A003", 24)
insert into DraftDetails ( OSid, itemCode, batchId, quantity) values ( 1, 4, "A004", 24)

insert into DraftLog (date, reason, userId) values ("2019-02-01 09:00:00", "2019  feb openstock", 1)

insert into DraftDetails ( OSid, itemCode, batchId, quantity) values ( 2, 1, "A005", 24)
insert into DraftDetails ( OSid, itemCode, batchId, quantity) values ( 2, 2, "A006", 24)
insert into DraftDetails ( OSid, itemCode, batchId, quantity) values ( 2, 3, "A007", 24)
insert into DraftDetails ( OSid, itemCode, batchId, quantity) values ( 2, 4, "A008", 24)

-- transactionlog and transaction details
-- 1
insert into TransactionLog (date, type, userId) values ("2019-01-10 10:00:00", "recieve", 1)
        
insert into TransactionDetails (transactionLogId, itemCode, batchId, quantity) values ( 1, 1, "A001", 200)
insert into TransactionDetails (transactionLogId, itemCode, batchId, quantity) values ( 1, 2, "A002", 200)
insert into TransactionDetails (transactionLogId, itemCode, batchId, quantity) values ( 1, 3, "A003", 200)
insert into TransactionDetails (transactionLogId, itemCode, batchId, quantity) values ( 1, 4, "A004", 200)

insert into CurrentStock ( itemCode, batchId, quantity) values ( 1, "A001", 200)
insert into CurrentStock ( itemCode, batchId, quantity) values ( 2, "A002", 200)
insert into CurrentStock ( itemCode, batchId, quantity) values ( 3, "A003", 200)
insert into CurrentStock ( itemCode, batchId, quantity) values ( 4, "A004", 220)


-- 2
insert into TransactionLog (date, type, userId) values ("2019-02-02 09:00:00", "recieve", 1)

insert into TransactionDetails (transactionLogId, itemCode, batchId, quantity) values ( 2, 1, "A005", 200)
insert into TransactionDetails (transactionLogId, itemCode, batchId, quantity) values ( 2, 2, "A006", 200)
insert into TransactionDetails (transactionLogId, itemCode, batchId, quantity) values ( 2, 3, "A007", 200)
insert into TransactionDetails (transactionLogId, itemCode, batchId, quantity) values ( 2, 4, "A008", 200)

insert into CurrentStock ( itemCode, batchId, quantity) values ( 1, "A005", 200)
insert into CurrentStock ( itemCode, batchId, quantity) values ( 2, "A006", 200)
insert into CurrentStock ( itemCode, batchId, quantity) values ( 3, "A007", 200)
insert into CurrentStock ( itemCode, batchId, quantity) values ( 4, "A008", 200)

-- 3
insert into TransactionLog (date, type, userId) values ("2019-02-03 09:00:00", "issue", 1)

insert into TransactionDetails (transactionLogId, itemCode, batchId, quantity) values ( 3, 1, "A005", 100)
insert into TransactionDetails (transactionLogId, itemCode, batchId, quantity) values ( 3, 2, "A006", 100)
insert into TransactionDetails (transactionLogId, itemCode, batchId, quantity) values ( 3, 3, "A007", 100)
insert into TransactionDetails (transactionLogId, itemCode, batchId, quantity) values ( 3, 4, "A008", 100)

UPDATE CurrentStock SET quantity = quantity-100 WHERE id = 5
UPDATE CurrentStock SET quantity = quantity-100 WHERE id = 6
UPDATE CurrentStock SET quantity = quantity-100 WHERE id = 7
UPDATE CurrentStock SET quantity = quantity-100 WHERE id = 8

-- 4
insert into TransactionLog (date, type, userId) values ("2019-02-05 10:00:00", "recieve", 1)
        
insert into TransactionDetails (transactionLogId, itemCode, batchId, quantity) values ( 4, 1, "A009", 200)
insert into TransactionDetails (transactionLogId, itemCode, batchId, quantity) values ( 4, 2, "A010", 200)
insert into TransactionDetails (transactionLogId, itemCode, batchId, quantity) values ( 4, 3, "A011", 200)
insert into TransactionDetails (transactionLogId, itemCode, batchId, quantity) values ( 4, 4, "A012", 200)

insert into CurrentStock ( itemCode, batchId, quantity) values ( 1, "A009", 200)
insert into CurrentStock ( itemCode, batchId, quantity) values ( 2, "A010", 200)
insert into CurrentStock ( itemCode, batchId, quantity) values ( 3, "A011", 200)
insert into CurrentStock ( itemCode, batchId, quantity) values ( 4, "A012", 200)

-- 5
insert into TransactionLog (date, type, userId) values ("2019-02-07 09:00:00", "issue", 1)

insert into TransactionDetails (transactionLogId, itemCode, batchId, quantity) values ( 5, 1, "A001", 150)
insert into TransactionDetails (transactionLogId, itemCode, batchId, quantity) values ( 5, 2, "A002", 150)
insert into TransactionDetails (transactionLogId, itemCode, batchId, quantity) values ( 5, 3, "A003", 150)
insert into TransactionDetails (transactionLogId, itemCode, batchId, quantity) values ( 5, 4, "A004", 150)

UPDATE CurrentStock SET quantity = quantity-150 WHERE id = 1
UPDATE CurrentStock SET quantity = quantity-150 WHERE id = 2
UPDATE CurrentStock SET quantity = quantity-150 WHERE id = 3
UPDATE CurrentStock SET quantity = quantity-150 WHERE id = 4

-- 6
insert into TransactionLog (date, type, userId) values ("2019-02-09 10:00:00", "issue", 1)
        
insert into TransactionDetails (transactionLogId, itemCode, batchId, quantity) values ( 6, 1, "A001", 10)
insert into TransactionDetails (transactionLogId, itemCode, batchId, quantity) values ( 6, 2, "A002", 10)
insert into TransactionDetails (transactionLogId, itemCode, batchId, quantity) values ( 6, 3, "A003", 10)
insert into TransactionDetails (transactionLogId, itemCode, batchId, quantity) values ( 6, 4, "A004", 10)

UPDATE CurrentStock SET quantity = quantity-10 WHERE id = 1
UPDATE CurrentStock SET quantity = quantity-10 WHERE id = 2
UPDATE CurrentStock SET quantity = quantity-10 WHERE id = 3
UPDATE CurrentStock SET quantity = quantity-10 WHERE id = 4

-- 7
insert into TransactionLog (date, type, userId) values ("2019-02-14 10:00:00", "recieve", 1)
        
insert into TransactionDetails (transactionLogId, itemCode, batchId, quantity) values ( 7, 1, "A013", 200)
insert into TransactionDetails (transactionLogId, itemCode, batchId, quantity) values ( 7, 2, "A014", 200)
insert into TransactionDetails (transactionLogId, itemCode, batchId, quantity) values ( 7, 3, "A015", 200)
insert into TransactionDetails (transactionLogId, itemCode, batchId, quantity) values ( 7, 4, "A016", 200)

insert into CurrentStock ( itemCode, batchId, quantity) values ( 1, "A013", 200)
insert into CurrentStock ( itemCode, batchId, quantity) values ( 2, "A014", 200)
insert into CurrentStock ( itemCode, batchId, quantity) values ( 3, "A015", 200)
insert into CurrentStock ( itemCode, batchId, quantity) values ( 4, "A016", 200)
