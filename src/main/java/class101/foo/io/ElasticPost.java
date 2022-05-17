package class101.foo.io;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
//@Document(indexName = "post")
@Document(indexName = "post_shard_8")
public class ElasticPost {
    @Id
    private String id;
    private String content;
}
