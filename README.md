# Layihe-Idareetme-Sistemi
CONFIGURING: 

<summary>MS SQL Server settings:</summary>

  [1] MS SQL Serverdə windows auth ilə login ol. `Security` qovluğundakı `Login` alt qovluğuna daxil olub `sa` adlı userə sağ klik et və `Properties`-i seç.  

  [2] Sol yuxarıdan `Status` bölməsini seç. Login-i `Enabled` et.

  [3] `General` bölməsinə get və şifrəni dəyiş. Apply et.

  [4] MS SQL Serveri restart et. (Çıxıb təzdən girmə. Serverin üzərinə gəlib sağ klik edib `Restart`-a bas fso)

<summary>Java settings</summary>
  [1] `application.properties` faylına get. ```spring.datasource.password``` propertiesini DB dakı öz şifrəni qoy. Username onsuzda ```sa```-dı.
