package moreira.jeffrei.jsmchocolateservice.web.model;


import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by jeffr on 2023-11-15
 */
public class ChocolatePagedList extends PageImpl<ChocolateDto> {
    public ChocolatePagedList(List<ChocolateDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }
    public ChocolatePagedList(List<ChocolateDto> content) {
        super(content);
    }
}
