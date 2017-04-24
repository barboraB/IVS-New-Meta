.PHONY: test all clean run pack
all:
	ant -f . jfx-build

clean:
	ant -f . -Dnb.internal.action.name=clean clean
	rm -rf xblask04_xcrkon00_xkosti07 xblask04_xcrkon00_xkosti07.zip

run:
	ant -f . jfxsa-run

test:
	ant -f /home/bblaskova/NetBeansProjects/IVS-New-Meta -Dnb.internal.action.name=test -Dignore.failing.tests=true test

pack:
	mkdir xblask04_xcrkon00_xkosti07
	mkdir -p xblask04_xcrkon00_xkosti07/install/
	cp nm-calculator-1.0.1.deb xblask04_xcrkon00_xkosti07/install/
	mkdir -p xblask04_xcrkon00_xkosti07/doc/
	cp dokumentace.pdf xblask04_xcrkon00_xkosti07/doc/
	mkdir -p xblask04_xcrkon00_xkosti07/repo/
	cp -r nm-calculator-1.0.1.deb build.xml debugging.png dokumentace.pdf Doxyfile.config .git .gitignore hodnoceni.txt lib LICENSE Makefile mockup  nbproject plan profiling README.md screenshot.png skutecnost.txt src test xblask04_xcrkon00_xkosti07/repo/
	mkdir xblask04_xcrkon00_xkosti07/xblask04_xcrkon00_xkosti07/
	mv  xblask04_xcrkon00_xkosti07/doc xblask04_xcrkon00_xkosti07/install xblask04_xcrkon00_xkosti07/repo xblask04_xcrkon00_xkosti07/xblask04_xcrkon00_xkosti07/
	zip -r xblask04_xcrkon00_xkosti07.zip xblask04_xcrkon00_xkosti07
	rm -rf xblask04_xcrkon00_xkosti07 
