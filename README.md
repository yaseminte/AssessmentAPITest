# AssessmentAPITest
“https://petstore.swagger.io” adresinde verilen swagger dökümanından yararlanırak “User” operasyonları yapıldı.

Programlama dili olarak Java, build tool olarak Maven, dependencies olarak Rest Assured, JUnit, TestNG, raporlama aracı olarak Extent Reports, IDE olarak Intellij kullanıldı. 

Yazılan testlerin class haricinde tek bir yerden çalıştırılabilmesi için PetStore_User_CRUDTest.xml isimli bir dosya oluşturuldu. Bu dosya üzerinde sağ click yapıp run tuşuna basarak çalıştırılabilir. Test koşumu bittikten sonra projemizde oluşan target dosyası içerisinden rapor package'ı içindeki html dosyasına sağ tıklayıp open in -> Browser -> adımlarını takip ederek istediğimiz browser üzerinden teste ait raporları ve ekran görüntülerine ulaşabiliriz.

Test yazılırken OOP Concept kullanıldı, readable, reusable, maintainable kod yazımına dikkat edildi ve mimari açıdan büyümeye hazır bir framework yapısı oluşturuldu.
 
### CRUDRequests class içerisinde yapılanlar

1-Yeni bir User oluşturmak için post request yapıldı ve status code doğrulandı <br/>
2-Oluşturulan User’in datasını almak için get request yapıldı ve gelen datayı doğrulamak için Object Mapper kullanıldı <br/>
3-Oluşturulan User’in tüm datasının güncellenmesi için put request yapıldı ve status code doğrulandı <br/>
4-Güncellenen User’in datasını almak için get request yapıldı ve gelen datayı doğrulamak için Pojo Class kullanıldı <br/>
5-Son olarak User’in silinmesi için delete request yapıldı ve status code doğrulandı <br/>

<p align="left">




<img height="40" width="40" src="https://raw.githubusercontent.com/github/explore/5b3600551e122a3277c2c5368af2ad5725ffa9a1/topics/java/java.png">
<code><img title="TestNG" height="25" src="https://github.com/IsmailMertDemirci/IsmailMertDemirci/blob/main/images/TestNG.png"></code>
<a href="https://www.api.com" target="_blank" rel="noreferrer"> <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQFpswKqlwex1UtYOHT6cWIVsJ3dQfEg__lFQ&usqp=CAU" alt="api" width="40" height="40"/> </a>
<a href="https://swagger.io/" target="_blank" rel="noopener"> <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2-qHhkU65OgRkaxFh1vRF4ycDfUOznjs7cEu5aXbMwWCYpNUMNPfDcL9Fox0a3_mbtAY&usqp=CAU" alt="swagger" width="40" height="40"/> </a>
<img height="40" width="40" src="https://raw.githubusercontent.com/github/explore/5b3600551e122a3277c2c5368af2ad5725ffa9a1/topics/git/git.png">
<a href="https://www.intelj.com" target="_blank" rel="noreferrer"> <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQak-N8W03mK25slV1lwM80i0y1obRPPJOaLA&usqp=CAU" alt="intelj" width="60" height="30"/> </a>
<a href="https://www.postman.com" target="_blank" rel="noreferrer"> <img src="https://www.semihduran.com/wp-content/uploads/2020/12/postman.jpg" alt="Postman" width="60" height="40"/> </a>
