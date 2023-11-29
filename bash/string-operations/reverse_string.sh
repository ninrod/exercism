#!/usr/bin/env bash

# This option will make the script exit when there is an error
set -o errexit
# This option will make the script exit when it tries to use an unset variable
set -o nounset

main() {
  for e in $@
  do
    a=""
    for ((i = ${#e}-1; i >= 0; i-- )) do
      a+=${e:i:1}
    done
    echo $a
  done

  return 0
}

main "$@"
