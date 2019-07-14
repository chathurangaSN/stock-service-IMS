drop table if exists CurrentStock;
drop table if exists DraftDetails;
drop table if exists DraftLog;
drop table if exists Stock;
drop table if exists StockDetails;
drop table if exists TransactionDetails;
drop table if exists TransactionLog;
drop table if exists Batch;

create table Batch (
        id integer not null auto_increment,
        expireDate date,
        manufactureDate date,
        number integer,
        receivedDate date,
        salesPrice float not null,
        unitePrice float not null,
        primary key (id)
    );

create table CurrentStock (
        id integer not null auto_increment,
--         brandId integer,
--         itemId integer,
        batchId varchar(255) not null,
	      itemCode varchar(255) not null,
        quantity double precision,
--         uomId integer,
        primary key (id)
    ); 
create table DraftDetails (
        id integer not null auto_increment,
       	batchId varchar(255) not null,
	      itemCode varchar(255) not null,
       
        quantity double precision not null,
        
        OSid integer,
        primary key (id)
    ); 
create table DraftLog (
       id integer not null auto_increment,
        date datetime,
        reason varchar(255) not null,
        userId integer not null,
        primary key (id)
    );
create table Stock (
       id integer not null auto_increment,
        date datetime,
        authorizedUserId integer not null,
        userId integer not null,
        reason varchar(255) not null,

        primary key (id)
    ); 
create table StockDetails (
        id integer not null auto_increment,
       
        batchId varchar(255) not null,
        itemCode varchar(255) not null,
        quantity double precision not null,
        
        OSid integer,
        primary key (id)
    );
create table TransactionDetails (
       id integer not null auto_increment,
--         brandId integer,
--         itemId integer,
        batchId varchar(255) not null,
	      itemCode varchar(255) not null,
        quantity double precision,
--         uomId integer,
        transactionLogId integer,
        primary key (id)
    ); 
create table TransactionLog (
        id integer not null auto_increment,
        date datetime,
        type varchar(255),
        userId varchar(255),
        primary key (id)
    );  

