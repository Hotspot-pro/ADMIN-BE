package hotspot.admin.auth.service;

import org.springframework.stereotype.Service;

import hotspot.admin.auth.controller.port.LoginService;
import hotspot.admin.auth.controller.request.LoginRequest;
import hotspot.admin.auth.controller.response.TokenResponse;
import hotspot.admin.auth.domain.Admin;
import hotspot.admin.auth.service.port.AdminRepository;
import hotspot.admin.auth.service.port.TokenProvider;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {

    private final AdminRepository adminRepository;
    private final TokenProvider tokenProvider;
    @Override
    public TokenResponse login(LoginRequest request) {
        Admin admin = adminRepository.findByAdminCode(request.getAdminCode());
        String accessToken = tokenProvider.createToken(admin.getAdminCode());

        return new TokenResponse(accessToken);
    }

}
