package jp.co.ctc.wjs.app.entry;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 加入サービスコントローラ.
 */
@RestController
@RequestMapping("/entry")
public class EntryController {

    /**
     * 登録処理を行う.
     *
     * @param request リクエスト情報
     * @return レスポンス
     */
    @PostMapping(value = "/regist")
    public EntryResponse registService1(@RequestBody final EntryRequest request) {

        EntryResponse response = new EntryResponse();
        response.setStatus("OK");
        response.setId(request.getId());
        response.setName(request.getName());

        return response;
    }

}
