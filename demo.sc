(import (libc libc))

(display (format "random: ~a\n" (c-random)))

(display (format "getenv: ~a\n" (c-getenv "PATH")))
