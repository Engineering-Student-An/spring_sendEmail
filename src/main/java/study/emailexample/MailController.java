package study.emailexample;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MailController {

    private final MailService mailService;

    @GetMapping("/simple")
    public void sendSimpleMailMessage() {
        mailService.sendSimpleMailMessage();
    }

    @GetMapping("/html")
    public void sendMimeMessage() {
        mailService.sendMimeMessage();
    }
}
