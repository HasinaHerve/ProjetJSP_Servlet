-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : ven. 14 juil. 2023 à 10:50
-- Version du serveur : 10.4.24-MariaDB
-- Version de PHP : 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `gr`
--

-- --------------------------------------------------------

--
-- Structure de la table `grade`
--

CREATE TABLE `grade` (
  `num` int(11) NOT NULL,
  `grade` varchar(25) NOT NULL,
  `duree` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `grade`
--

INSERT INTO `grade` (`num`, `grade`, `duree`) VALUES
(1, 'STAGIAIRE', 1),
(2, '2EME CLASSE 1ER ECHELON', 2),
(3, '2EME CLASSE 2EME ECHELON', 2),
(4, '2EME CLASSE 3EME ECHELON', 3),
(5, '1ER CLASSE 1ER ECHELON', 2),
(6, '1ER CLASSE 2EME ECHELON', 2),
(7, '1ER CLASSE 3EME ECHELON', 3),
(8, 'PRINCIPALE 1ER ECHELON', 2),
(9, 'PRINCIPALE 2EME ECHELON', 2),
(10, 'PRINCIPALE 3EME ECHELON', 3),
(11, 'EXCEPTIONNEL 1ER ECHELON', 2),
(12, 'EXCEPTIONNEL 2EME ECHELON', 2),
(13, 'EXCEPTIONNEL 3EME ECHELON', 3);

-- --------------------------------------------------------

--
-- Structure de la table `message`
--

CREATE TABLE `message` (
  `msg` varchar(500) NOT NULL,
  `imU` int(11) NOT NULL,
  `imR` int(11) NOT NULL,
  `dateE` date NOT NULL,
  `heureE` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `personnel`
--

CREATE TABLE `personnel` (
  `im` int(11) NOT NULL,
  `cin` varchar(12) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `prenoms` varchar(40) DEFAULT NULL,
  `dateNaiss` date NOT NULL,
  `aa` varchar(50) NOT NULL,
  `grade` varchar(25) NOT NULL,
  `categorie` varchar(3) NOT NULL,
  `indice` int(11) NOT NULL,
  `lt` varchar(50) NOT NULL,
  `dateE` date NOT NULL,
  `ad` varchar(50) NOT NULL,
  `tel` varchar(10) DEFAULT NULL,
  `sm` varchar(11) NOT NULL,
  `st` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `personnel`
--

INSERT INTO `personnel` (`im`, `cin`, `nom`, `prenoms`, `dateNaiss`, `aa`, `grade`, `categorie`, `indice`, `lt`, `dateE`, `ad`, `tel`, `sm`, `st`) VALUES
(1234, '234567890123', 'RANDRIANANTENAINA', 'Hasina zeze', '2002-05-18', 'Chef', '', 'IV', 345, 'fianarantsoa', '2022-05-18', 'sahalava', '0343253903', 'Célibataire', 'Actif'),
(2423, '123456789012', 'HASINA', 'H', '2022-05-18', 'A', 'STAGIAIRE', 'I', 345, 'AAA', '2022-05-18', 'FFF', '0345617899', 'Célibataire', 'Actif'),
(5555, '123456789013', 'HASINA', 'H', '2022-05-18', 'A', '2EME CLASSE 1ER ECHELON', 'I', 123, 'A', '2022-05-18', 'sss', '0345617899', 'Célibataire', 'Actif');

-- --------------------------------------------------------

--
-- Structure de la table `reclassement`
--

CREATE TABLE `reclassement` (
  `im` int(11) NOT NULL,
  `num` int(11) NOT NULL,
  `dateR` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `reclassement`
--

INSERT INTO `reclassement` (`im`, `num`, `dateR`) VALUES
(5555, 3, '2022-05-18'),
(1234, 1, '2029-05-18');

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

CREATE TABLE `utilisateur` (
  `im` int(11) NOT NULL,
  `nomU` varchar(50) NOT NULL,
  `mdp` varchar(50) NOT NULL,
  `pdp` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `utilisateur`
--

INSERT INTO `utilisateur` (`im`, `nomU`, `mdp`, `pdp`) VALUES
(1234, 'Admin', 'hasina', '../../../../images/animal-03.jpg'),
(2423, 'hasina', 'hasina', '../../../../images/animal-01.jpg');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `grade`
--
ALTER TABLE `grade`
  ADD PRIMARY KEY (`num`);

--
-- Index pour la table `message`
--
ALTER TABLE `message`
  ADD KEY `imU` (`imU`);

--
-- Index pour la table `personnel`
--
ALTER TABLE `personnel`
  ADD PRIMARY KEY (`im`);

--
-- Index pour la table `reclassement`
--
ALTER TABLE `reclassement`
  ADD KEY `im` (`im`),
  ADD KEY `num` (`num`);

--
-- Index pour la table `utilisateur`
--
ALTER TABLE `utilisateur`
  ADD PRIMARY KEY (`im`);

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `message`
--
ALTER TABLE `message`
  ADD CONSTRAINT `message_ibfk_1` FOREIGN KEY (`imU`) REFERENCES `personnel` (`im`);

--
-- Contraintes pour la table `reclassement`
--
ALTER TABLE `reclassement`
  ADD CONSTRAINT `reclassement_ibfk_1` FOREIGN KEY (`im`) REFERENCES `personnel` (`im`),
  ADD CONSTRAINT `reclassement_ibfk_2` FOREIGN KEY (`num`) REFERENCES `grade` (`num`);

--
-- Contraintes pour la table `utilisateur`
--
ALTER TABLE `utilisateur`
  ADD CONSTRAINT `utilisateur_ibfk_1` FOREIGN KEY (`im`) REFERENCES `personnel` (`im`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
