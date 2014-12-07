DROP TABLE IF EXISTS "Alat_Musik";
CREATE TABLE "Alat_Musik" ("ID_Alat" INTEGER, "Image_1" TEXT, "Image_2" TEXT, "Image_3" TEXT, "Data" TEXT);
DROP TABLE IF EXISTS "Daerah";
CREATE TABLE "Daerah" ("ID_Daerah" INTEGER PRIMARY KEY  NOT NULL , "Image_Logo" TEXT, "Image_Peta" TEXT, "Image_Keadaan" TEXT, "Data" TEXT);
DROP TABLE IF EXISTS "Senjata";
CREATE TABLE "Senjata" ("ID_Senjata" INTEGER PRIMARY KEY  NOT NULL  DEFAULT (null) ,"Image" TEXT,"Nama_Senjata" VARCHAR,"Asal" VARCHAR,"Data" TEXT);
DROP TABLE IF EXISTS "kamus";
CREATE TABLE "kamus" ("ID" INTEGER PRIMARY KEY  NOT NULL , "Indonesia" TEXT, "Sunda" TEXT);
