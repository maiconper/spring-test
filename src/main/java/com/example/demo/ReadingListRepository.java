package com.example.demo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReadingListRepository extends JpaRepository<Book,Long>{

    /*
    static{

        Book bk = new Book("Maicon","N'ao sei o que [e isso","O amor","Jesus","evangelho");



    }
*/
        List<Book> findByReader(String reader);

    
}
