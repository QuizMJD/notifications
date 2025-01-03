INSERT INTO notification_templates (
    id,
    type,
    sender_id,
    name,
    content,
    reason,
    deleted,
    created_at,
    created_by,
    updated_at,
    updated_by
) VALUES
      ('1a2b3c4d-5678-90ab-cdef-1234567890ab', 1, '1111-2222-3333-4444', 'OTP SMS Template', 'OTP của bạn là: {{otp}}', NULL, false, CURRENT_TIMESTAMP, 'admin', NULL, NULL),
      ('2b3c4d5e-6789-01bc-def1-2345678901bc', 2, '5555-6666-7777-8888', 'Email Verification Template', '<h1>Xác nhận Email</h1><p>Mã xác nhận của bạn là: {{otp}}</p>', 'Dùng để xác thực email người dùng', false, CURRENT_TIMESTAMP, 'admin', NULL, NULL),
      ('3c4d5e6f-7890-12cd-ef23-4567890123cd', 1, '9999-0000-aaaa-bbbb', 'Password Reset SMS', 'Mã đặt lại mật khẩu: {{otp}}', 'Reset mật khẩu', false, CURRENT_TIMESTAMP, 'admin', NULL, NULL);
