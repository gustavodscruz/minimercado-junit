-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 02-Dez-2022 às 03:17
-- Versão do servidor: 10.4.27-MariaDB
-- versão do PHP: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `bd_minimercado`
CREATE DATABASE `bd_minimercado`;
USE `bd_minimercado`;
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `categoria`
--

CREATE TABLE `categoria` (
  `Cod_Cat` int(11) NOT NULL,
  `Descricao` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `Cod_Cli` int(11) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `Dt_Nasc` date NOT NULL,
  `CPF` char(14) NOT NULL,
  `RG` char(11) NOT NULL,
  `Telefone` char(15) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Comp_Res` varchar(80) NOT NULL,
  `Senha` varchar(200) DEFAULT NULL,
  `NomeRua` varchar(200) NOT NULL,
  `NomeBairro` varchar(200) NOT NULL,
  `Cidade` varchar(200) NOT NULL,
  `NumerReside` varchar(50) NOT NULL,
  `CEP` varchar(10) NOT NULL,
  `Comple` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`Cod_Cli`, `Nome`, `Dt_Nasc`, `CPF`, `RG`, `Telefone`, `Email`, `Comp_Res`, `Senha`, `NomeRua`, `NomeBairro`, `Cidade`, `NumerReside`, `CEP`, `Comple`) VALUES
(7, 'Teste', '0200-10-10', '123.123.123-21', 'null', '94532-2345', 'teste@email.com', 'null', '$2y$10$PxyTuBXNwJo2TWWBMG6oteuFarwXNc508ZT9.okUPHVfyz3xDNFD2', 'Rua Teste', 'Bairro Teste', 'SP', '1', '00000-000', 'Teste'),
(9, 'TesteDois', '0200-10-10', '123.123.123-21', 'null', '00000-0000', 'teste2@email.com', 'null', '$2y$10$t550Q28Glgy5iZbjavTgj.t5Eh.IU4ajG9pQRufWw9MrFYruxADqK', 'Rua TesteDois', 'Bairro TesteDois', 'SP', '2', '00000-000', 'Teste'),
(10, 'Guilherme', '2020-12-15', '123.123.123-21', 'null', '94532-2345', 'teste5@email.com', 'null', '$2y$10$DLrBEtfNx3Rby2q0DRPnSOkGdUnYtREorOyDfM2Jw0UzfassCgIUC', 'Rua Almeida', 'Vila Jacui', 'SP', '11', '08050-410', 'Nenhum'),
(11, 'Guilherme', '2000-10-10', '123.123.123-21', 'null', '94532-2345', 'teste15@email.com', 'null', '$2y$10$XyKDKG4jkX4pZaHtBJ0RmOB/SVRo6syhDB4uvkEBbbRF4pQ4d26QG', 't', 'Vila Jacui', 'SP', '1', '08060-410', 'Nenhum'),
(12, 'Guilherme', '2000-10-10', '123.123.123-21', 'null', '94532-2345', 'teste154@email.com', 'null', '$2y$10$v7t222QZIa.qtZUU8E65Yu69e93am7XYxJN84qd1Ue22CumeSPAb6', 't', 'Vila Jacui', 'SP', '1', '08060-410', 'Nenhum');

-- --------------------------------------------------------

--
-- Estrutura da tabela `contato_fornc`
--

CREATE TABLE `contato_fornc` (
  `Cod_For` int(11) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `CPF` char(14) NOT NULL,
  `RG` char(11) NOT NULL,
  `Telefone` char(15) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Comp_Res` varchar(80) NOT NULL,
  `Cod_Empresa` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `contato_fornc`
--

INSERT INTO `contato_fornc` (`Cod_For`, `Nome`, `CPF`, `RG`, `Telefone`, `Email`, `Comp_Res`, `Cod_Empresa`) VALUES
(1, 'Mário Enrico Nathan Ferreira', '28110719031', '137566724', '272756-1543', 'mario_ferreira@controtel.com.br', 'Rua', 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `empresa`
--

CREATE TABLE `empresa` (
  `Cod_Empresa` int(11) NOT NULL,
  `Nome_Fantasia` char(50) NOT NULL,
  `CNPJ` char(20) NOT NULL,
  `Endereco` varchar(70) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Telefone` char(15) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `fornece`
--

CREATE TABLE `fornece` (
  `Cod_Fornece` int(11) NOT NULL,
  `Cod_For` int(11) NOT NULL,
  `Cod_Pro` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `Cod_Fun` int(11) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `CPF` char(14) NOT NULL,
  `RG` char(11) NOT NULL,
  `CTPS` char(10) NOT NULL,
  `Comp_Res` varchar(80) NOT NULL,
  `Cod_Tipo` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`Cod_Fun`, `Nome`, `CPF`, `RG`, `CTPS`, `Comp_Res`, `Cod_Tipo`) VALUES
(1, 'Edson Anderson Ribeiro', '77411190870', '484944861', '6343657412', 'Rua Dom João Batista da Costa', 1),
(2, 'Fernando Thiago das Neves', '49055965804', '360961290', '2366770793', 'Rua Gelmirez Ribeiro Queiroga', 2),
(3, 'Teste', '3', '3', '3', 'Teste', 3);

-- --------------------------------------------------------

--
-- Estrutura da tabela `itens_nota_fiscal`
--

CREATE TABLE `itens_nota_fiscal` (
  `N_PDV` int(11) NOT NULL,
  `Cod_Pro` int(11) NOT NULL,
  `Qtde_do_Produto` varchar(70) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `nota_fiscal`
--

CREATE TABLE `nota_fiscal` (
  `N_PDV` int(11) NOT NULL,
  `Cod_Cli` int(11) NOT NULL,
  `Cod_Fun` int(11) NOT NULL,
  `HCompra` datetime NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE `produto` (
  `Cod` int(11) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `Caracteristica` varchar(70) NOT NULL,
  `Fabricante` varchar(50) NOT NULL,
  `Preco_de_Custo` decimal(10,0) NOT NULL,
  `Preco_de_Venda` decimal(10,0) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`Cod`, `Nome`, `Caracteristica`, `Fabricante`, `Preco_de_Custo`, `Preco_de_Venda`) VALUES
(1, 'Banana', 'Fruta', 'Hortifrut gui', '5', '10'),
(14, 'Sabonete', 'Higiene', 'Produtos Higiene', '4', '15'),
(13, 'Detergente', 'Higiene', 'Produtos Higiene', '1', '9'),
(5, 'Refrigerante', 'Bebidas', 'bebidas', '5', '10'),
(6, 'Suco', 'Bebidas', 'bebidas gui', '7', '8'),
(7, 'Vinho', 'Bebidas', 'bebidas gui', '2', '8'),
(8, 'Whiskey', 'Bebidas', 'bebidas gui', '8', '16'),
(9, 'Alcatra', 'Acougue', 'Acougues gui', '20', '30'),
(4, 'Melancia', 'Fruta', 'Hortfrut', '33', '23'),
(11, 'Picanha', 'Acougue', 'Acougues gui', '25', '30'),
(12, 'Amaciante', 'Higiene', 'Produtos Higiene', '2', '8'),
(15, 'Shampoos', 'Higiene', 'Produtos Higiene', '7', '30'),
(16, 'Bolo de chocolate', 'Padaria', 'Pães Gostosos', '4', '10'),
(17, 'Croissant', 'Padaria', 'Pães Gostosos', '9', '10'),
(18, 'Pão', 'Padaria', 'Pães Gostosos', '10', '5'),
(19, 'Pao de queijo', 'Padaria', 'Pães Gostosos', '12', '8'),
(20, 'Ervilha', 'Enlatado', 'Enlatados Gui', '10', '15'),
(21, 'Feijao', 'Enlatado', 'Enlatados Gui', '11', '20');

-- --------------------------------------------------------

--
-- Estrutura da tabela `promocao`
--

CREATE TABLE `promocao` (
  `CodDes` int(11) NOT NULL,
  `Desconto` varchar(45) NOT NULL,
  `Data_Inicio` varchar(45) DEFAULT NULL,
  `Data_Final` varchar(45) DEFAULT NULL,
  `Categoria` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Extraindo dados da tabela `promocao`
--

INSERT INTO `promocao` (`CodDes`, `Desconto`, `Data_Inicio`, `Data_Final`, `Categoria`) VALUES
(1, '10', '20/10/2022', '10/01/2023', 'Geral');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tipo_func`
--

CREATE TABLE `tipo_func` (
  `Cod_Tipo` int(11) NOT NULL,
  `Cargo` varchar(50) NOT NULL,
  `Funcao` varchar(50) NOT NULL,
  `Salario` decimal(10,0) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `Usuario` char(10) NOT NULL,
  `Senha` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`Usuario`, `Senha`) VALUES
('Admin', '123');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`Cod_Cat`);

--
-- Índices para tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`Cod_Cli`);

--
-- Índices para tabela `contato_fornc`
--
ALTER TABLE `contato_fornc`
  ADD PRIMARY KEY (`Cod_For`);

--
-- Índices para tabela `empresa`
--
ALTER TABLE `empresa`
  ADD PRIMARY KEY (`Cod_Empresa`);

--
-- Índices para tabela `fornece`
--
ALTER TABLE `fornece`
  ADD PRIMARY KEY (`Cod_Fornece`);

--
-- Índices para tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`Cod_Fun`);

--
-- Índices para tabela `nota_fiscal`
--
ALTER TABLE `nota_fiscal`
  ADD PRIMARY KEY (`N_PDV`);

--
-- Índices para tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`Cod`);

--
-- Índices para tabela `promocao`
--
ALTER TABLE `promocao`
  ADD PRIMARY KEY (`CodDes`);

--
-- Índices para tabela `tipo_func`
--
ALTER TABLE `tipo_func`
  ADD PRIMARY KEY (`Cod_Tipo`);

--
-- Índices para tabela `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`Usuario`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `categoria`
--
ALTER TABLE `categoria`
  MODIFY `Cod_Cat` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `Cod_Cli` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de tabela `contato_fornc`
--
ALTER TABLE `contato_fornc`
  MODIFY `Cod_For` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `empresa`
--
ALTER TABLE `empresa`
  MODIFY `Cod_Empresa` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `fornece`
--
ALTER TABLE `fornece`
  MODIFY `Cod_Fornece` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `Cod_Fun` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `nota_fiscal`
--
ALTER TABLE `nota_fiscal`
  MODIFY `N_PDV` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `produto`
--
ALTER TABLE `produto`
  MODIFY `Cod` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
