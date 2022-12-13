package ru.dad.pm_2.task4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
4. В некоторой организации хранятся документы (см. класс Document). Сейчас все
документы лежат в ArrayList, из-за чего поиск по id документа выполняется
неэффективно. Для оптимизации поиска по id, необходимо помочь сотрудникам
перевести хранение документов из ArrayList в HashMap.
public class Document {
public int id;
public String name;
public int pageCount;
}
Реализовать метод со следующей сигнатурой:
public Map<Integer, Document> organizeDocuments(List<Document> documents)
 */
public class Document {
    public int id;
    public String name;
    public int pageCount;

    public Map<Integer, Document> organizeDocuments(List<Document> documents) {
        Map<Integer, Document> documentMap = new HashMap<>();
        for (Document document : documents) {
            documentMap.put(document.id, document);
        }
        return documentMap;
    }
}
