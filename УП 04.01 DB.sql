set ansi_nulls on
go
set ansi_padding on
go
set quoted_identifier on
go
create database [DB]
go
use [DB]
go
create table [dbo].[Post]
(
[ID_Post] [int] not null identity(1,1),
[Post] [varchar] (50) not null
constraint [PK_Post] primary key clustered
([ID_Post] ASC) on [PRIMARY],
)
go
create table [dbo].[Number]
(
[ID_Number] [int] not null identity(1,1),
[Category] [varchar] (50) not null
constraint [PK_Number] primary key clustered
([ID_Number] ASC) on [PRIMARY],
)
go
create table [dbo].[Employee]
(
[ID_Employee] [int] not null identity(1,1),
[First_Name] [varchar] (50) not null,
[Last_Name] [varchar] (50) not null,
[Middle_Name] [varchar] (50) not null,
[Education] [varchar] (150) not null,
[Salary] [varchar] (50) not null,
[ID_Post] [int] not null,
constraint [PK_Employee] primary key clustered
([ID_Employee] ASC) on [PRIMARY],
constraint [FK_Post] foreign
key ([ID_Post])
references [dbo].[Post] ([ID_Post])
)
go
create table [dbo].[Number_Category]
(
[ID_Number_Category] [int] not null identity(1,1),
[Kolvo] [int] not null,
[Kolvo_Room] [int] not null,
[Info] [varchar] (400) not null,
[Price] [varchar] (50) not null,
[ID_Number] [int] not null,
constraint [PK_Number_Category] primary key clustered
([ID_Number_Category] ASC) on [PRIMARY],
constraint [FK_Number] foreign
key ([ID_Number])
references [dbo].[Number] ([ID_Number])
)
go
create table [dbo].[Number_S]
(
[ID_Number_S] [int] not null identity(1,1),
[Bron] [varchar] (100) not null,
[Zaezd] date not null,
[Vuezd] date not null,
[Summa] [varchar] (50) not null,
[ID_Number] [int] not null,
[ID_Employee] [int] not null,
constraint [PK_Number_S] primary key clustered
([ID_Number_S] ASC) on [PRIMARY],
constraint [FK_Employee] foreign
key ([ID_Employee])
references [dbo].[Employee] ([ID_Employee]),
constraint [FK_Number] foreign
key ([ID_Number])
references [dbo].[Number] ([ID_Number])
)
go
create table [dbo].[Bron]
(
[ID_Bron] [int] not null identity(1,1),
[First_Name] [varchar] (50) not null,
[ID_Number_Sos] [int] not null,
constraint [PK_Bron] primary key clustered
([ID_Bron] ASC) on [PRIMARY],
constraint [FK_Number_Sos] foreign
key ([ID_Number_Sos])
references [dbo].[Number_Sos] ([ID_Number_Sos])
)
go
create table [dbo].[Client]
(
[ID_Client] [int] not null identity(1,1),
[First_Name] [varchar] (50) not null,
[Last_Name] [varchar] (50) not null,
[Middle_Name] [varchar] (50) not null,
[Sex] [varchar] (1) not null,
[Passport] [varchar] (10) not null,
[ID_Number_S] [int],
constraint [PK_Client] primary key clustered
([ID_Client] ASC) on [PRIMARY],
constraint [FK_Number_S] foreign
key ([ID_Number_S])
references [dbo].[Number_S] ([ID_Number_S])
)
go
create table [dbo].[Breakfast]
(
[ID_Breakfast] [int] not null identity(1,1),
[Kolvo] [int] not null,
[Zakaz] [varchar] (50) not null,
[Price] [varchar] (50) not null,
[ID_Number] [int] not null,
[ID_Client] [int],
constraint [PK_Breakfast] primary key clustered
([ID_Breakfast] ASC) on [PRIMARY],
constraint [FK_Client] foreign
key ([ID_Client])
references [dbo].[Client] ([ID_Client]),
constraint [FK_Number] foreign
key ([ID_Number])
references [dbo].[Client] ([ID_Number])
)
go
